package co.igb.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbotero
 */
public class DeliveryNoteDTO {

    private String cardCode;
    private Integer orderNumber;
    private List<DeliveryNoteLineDTO> lines;

    public DeliveryNoteDTO() {
        lines = new ArrayList<>();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<DeliveryNoteLineDTO> getLines() {
        return lines;
    }

    public void setLines(List<DeliveryNoteLineDTO> lines) {
        this.lines = lines;
    }

    public static class DeliveryNoteLineDTO {

        private String itemCode;
        private Integer quantity;
        private String warehouseCode;
        private List<DeliveryNoteBinAllocationDTO> binAllocation;

        public DeliveryNoteLineDTO() {
            binAllocation = new ArrayList<>();
        }

        public String getItemCode() {
            return itemCode;
        }

        public void setItemCode(String itemCode) {
            this.itemCode = itemCode;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getWarehouseCode() {
            return warehouseCode;
        }

        public void setWarehouseCode(String warehouseCode) {
            this.warehouseCode = warehouseCode;
        }

        public List<DeliveryNoteBinAllocationDTO> getBinAllocation() {
            return binAllocation;
        }

        public void setBinAllocation(List<DeliveryNoteBinAllocationDTO> binAllocation) {
            this.binAllocation = binAllocation;
        }

        public static class DeliveryNoteBinAllocationDTO {

            private Integer quantity;
            private Long binAbs;

            public Long getBinAbs() {
                return binAbs;
            }

            public void setBinAbs(Long binAbs) {
                this.binAbs = binAbs;
            }

            public Integer getQuantity() {
                return quantity;
            }

            public void setQuantity(Integer quantity) {
                this.quantity = quantity;
            }

            @Override
            public String toString() {
                return "DeliveryNoteBinAllocationDTO{" + "quantity=" + quantity + ", binAbs=" + binAbs + '}';
            }
        }

        @Override
        public String toString() {
            return "DeliveryNoteLineDTO{" + "itemCode=" + itemCode + ", quantity=" + quantity + ", warehouseCode=" + warehouseCode + ", binAllocation=" + binAllocation + '}';
        }
    }

    @Override
    public String toString() {
        return "DeliveryNoteDTO{" + "cardCode=" + cardCode + ", orderNumber=" + orderNumber + ", lines=" + lines + '}';
    }

}
