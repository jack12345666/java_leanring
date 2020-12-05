package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TSetupDTO;
import com.vpn.website.client.model.TRolepermission;
import com.vpn.website.client.model.TSetup;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:28
 */
@Mapper(componentModel = "spring")
public interface TSetupMap {
    TSetupDTO doToDto(TSetup tSetup);
}
