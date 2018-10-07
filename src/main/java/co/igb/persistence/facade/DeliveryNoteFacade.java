package co.igb.persistence.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dbotero
 */
@Stateless
public class DeliveryNoteFacade {

    private static final Logger CONSOLE = Logger.getLogger(DeliveryNoteFacade.class.getSimpleName());

    @EJB
    private PersistenceConf persistenceConf;

    public DeliveryNoteFacade() {
    }

    public List<Object[]> getDeliveryNoteData(Integer deliveryDocEntry, String companyName) {
        StringBuilder sb = new StringBuilder();
        sb.append("select cast(enc.docentry as int) docentry, cast(enc.docnum as int) docnum, cast(enc.objtype as int) objtype, ");
        sb.append("cast(enc.cardcode as varchar(20)) cardcode, cast(enc.slpcode as int) slpcode, cast(enc.cntctcode as int) cntctcode, ");
        sb.append("cast(det.linenum as int) linenum, cast(det.itemcode as varchar(20)) itemcode, cast(det.quantity as int) quantity from odln enc ");
        sb.append("inner join dln1 det on det.docentry = enc.docentry where enc.docentry =");
        sb.append(deliveryDocEntry);
        try {
            return persistenceConf.chooseSchema(companyName).createNativeQuery(sb.toString()).getResultList();
        } catch (Exception e) {
            CONSOLE.log(Level.SEVERE, "Ocurrio un error al consultar los datos de la entrega. ", e);
            return new ArrayList<>();
        }
    }
}
