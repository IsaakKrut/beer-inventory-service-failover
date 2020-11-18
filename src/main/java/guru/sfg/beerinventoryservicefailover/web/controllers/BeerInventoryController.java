package guru.sfg.beerinventoryservicefailover.web.controllers;

import guru.sfg.brewery.model.BeerInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class BeerInventoryController {
    @GetMapping("inventory-failover")
    List<BeerInventoryDto> listBeersByUpc(@PathVariable String upc) {
        log.debug("Beer Inventory failover for upc:" + upc);

        return Arrays.asList(BeerInventoryDto.builder()
                .beerId(UUID.fromString("0000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build());
    }
}
