package pos.machine;

import java.util.List;

public class PosMachine {
    public String printReceipt(List<String> barcodes) {

        return null;
    }

    public List<ItemInfo> loadAllItemsInfo(){
        List<ItemInfo> itemsInfo = ItemDataLoader.loadAllItemInfos();
        return itemsInfo;
    }
}
