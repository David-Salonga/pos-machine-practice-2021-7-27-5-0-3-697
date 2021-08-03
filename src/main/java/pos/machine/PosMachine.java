package pos.machine;

import java.util.ArrayList;
import java.util.List;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {

        return null;
    }

    public List<ItemInfo> loadAllItemsInfo(){
        List<ItemInfo> itemsInfo = ItemDataLoader.loadAllItemInfos();
        return itemsInfo;
    }

    public List<Item> calculateSubtotal(List<Item> items) {
        List <Item> itemsWithSubtotal = new ArrayList<>();
        for (Item item : items) {
            item.setSubtotal(item.getQuantity()*item.getUnitPrice());
            itemsWithSubtotal.add(item);
        }
        return itemsWithSubtotal;
    }
}
