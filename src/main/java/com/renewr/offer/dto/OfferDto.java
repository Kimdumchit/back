package com.renewr.offer.dto;

import com.renewr.collect.dto.CollectDto;
import com.renewr.collect.entity.Collect;
import com.renewr.offer.entity.Offer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class OfferDto {
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class post{
        private Long collectId;

        private String content;

        private String imageUrl;

        private String location;
    }

    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class response{

        private Long offerId;

        private String content;

        private String imageUrl;

        private CollectDto.ResponseId collect;
    }

    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListResponse{
        private CollectDto.listResponse listCollect;
        private Offer.OfferStatus status;
    }
}
