package gui;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan LaRue, rml5169@rit.edu
 */
public class OwnedUserTools {

    private List<Integer> tids;
    private List<Integer> salePrices;
    private List<String> toolNames;
    private List<Boolean> lendable;
    private List<String> categories;

    public OwnedUserTools(int uid) {
        this.tids = new ArrayList<>();
        this.salePrices = new ArrayList<>();
        this.toolNames = new ArrayList<>();
        this.lendable = new ArrayList<>();
        this.categories = new ArrayList<>();
        SQLController.getUserTools(uid, tids, salePrices, toolNames, lendable
                , categories);
    }

    public List<Integer> getTids() {
        return tids;
    }

    public List<Integer> getSalePrices() {
        return salePrices;
    }

    public List<String> getToolNames() {
        return toolNames;
    }

    public Integer getTidFromToolName(int index) {
        return tids.get(index);
    }

    public List<Boolean> getLendable() {
        return lendable;
    }

    public List<String> getCategories() {
        return categories;
    }
}
