package guru.sfg.beerinventoryservicefailover.web.controllers;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class BeerInventoryController {

    @GetMapping("api/v1/beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId) {
        log.debug("Beer Inventory failover for beerId:" + beerId);

        return Arrays.asList(BeerInventoryDto.builder()
                .beerId(UUID.fromString("0000"))
                .quantityOnHand(999)
                .build());
    }

    @GetMapping("api/v1/beer/upc/{upc}/inventory")
    List<BeerInventoryDto> listBeersByUpc(@PathVariable String upc) {
        log.debug("Beer Inventory failover for upc:" + upc);

        return Arrays.asList(BeerInventoryDto.builder()
                .beerId(UUID.fromString("0000"))
                .quantityOnHand(999)
                .build());
    }
}
