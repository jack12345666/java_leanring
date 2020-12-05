package com.vpn.website.client.mapstruct;

import com.vpn.website.client.dto.TEmployeeDTO;
import com.vpn.website.client.dto.TEmployeeroleDTO;
import com.vpn.website.client.model.TEmployee;
import com.vpn.website.client.model.TEmployeerole;
import org.mapstruct.Mapper;

/**
 * @author fml
 * @date 2020/8/16 18:26
 */
@Mapper(componentModel = "spring")
public interface TEmployeeroleMap {
    TEmployeeroleDTO doToDto(TEmployeerole tEmployeerole);
}
