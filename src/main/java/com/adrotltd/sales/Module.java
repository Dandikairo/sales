package com.adrotltd.sales;

import com.adroitltd.metadata.MenuGroup;
import com.adroitltd.metadata.TableViewMetaData;
import java.util.List;

/**
 *
 * @author Okello
 */
public interface Module {
    public MenuGroup getNavigationMenu();
    public TableViewMetaData getTargetViewMetaData(int targetId);
    public List<?> getTargetData(int targetId);
}
