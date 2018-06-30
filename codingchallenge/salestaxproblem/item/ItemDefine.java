package codingchallenge.salestaxproblem.item;

/**
 * Created by Govind on 29/05/2018
 */
public class ItemDefine {
    public enum ItemType{
        BOOK(true,false),
        MEDICAL(true,false),
        FOOD(true,false),
        OTHER(false,false),
        IMPORTED_BOOK(true,true),
        IMPORTED_MEDICAL(true,true),
        IMPORTED_FOOD(true,true),
        IMPORTED_OTHER(false,true);

        private boolean isExempted;
        private boolean isImported;

        ItemType(boolean exempted, boolean imported){
            isExempted = exempted;
            isImported = imported;
        }
        public boolean isImported(){
            return isImported;
        }
        public boolean isExempted(){
            return isExempted;
        }

    };
}
