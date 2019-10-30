package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class BeerServiceImpl implements BeerService
{

    public BeerServiceImpl()
    {
    }

    @Override
    public BeerDto getBeerById(UUID beerId)
    {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Crazy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto)
    {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto)
    {
        //TODO impl - would add real impl to update beer
    }

    @Override
    public void deleteBeer(UUID beerId)
    {

    }


}
