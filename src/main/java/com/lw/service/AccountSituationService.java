package com.lw.service;

import com.lw.entity.FundAccountSituationEntity;

import java.util.List;

public interface AccountSituationService {

    List<FundAccountSituationEntity> getList(FundAccountSituationEntity query);

}
