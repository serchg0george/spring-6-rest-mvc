package com.springframework.spring6restmvc.mappers;

import com.springframework.spring6restmvc.entities.Beer;
import com.springframework.spring6restmvc.models.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);


}
