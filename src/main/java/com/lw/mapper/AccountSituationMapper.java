package com.lw.mapper;

import com.lw.entity.FundAccountSituationEntity;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface AccountSituationMapper {

    List<FundAccountSituationEntity> getList(FundAccountSituationEntity query);
}
