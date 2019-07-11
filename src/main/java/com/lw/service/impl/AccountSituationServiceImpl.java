package com.lw.service.impl;

import com.lw.entity.FundAccountSituationEntity;
import com.lw.mapper.AccountSituationMapper;
import com.lw.service.AccountSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountSituationServiceImpl implements AccountSituationService {
    @Autowired
    private AccountSituationMapper accountMmapper;

    @Override
    public List<FundAccountSituationEntity> getList(FundAccountSituationEntity query) {
        return accountMmapper.getList(query);
    }
}
