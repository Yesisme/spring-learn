package com.jay.spring.service.v2;

import com.jay.spring.dao.v2.AccountDao;
import com.jay.spring.dao.v2.ItemDao;

/**
 * @author xiang.wei
 * @create 2018/6/11 14:42
 */
public class PetStoreService {
    private AccountDao accountDao;
    private ItemDao itemDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public ItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }
}
