package com.acme.platform.pc027793u20241a649.MediSupply.infrastructure.persistence.jpa.embeddeble;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@Getter
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
public class FulfillmentPeriodPersistanceEmbeddeble {

    //se agrega el primer dato
    @Column(name = "Start_Date", nullable = false)
    private LocalDate start;

    //se agrega el segundo dato

    @Column(name = "End_Date", nullable = false)
    private LocalDate end;


    //los dos se juntan en el constructor
    public FulfillmentPeriodPersistanceEmbeddeble(LocalDate startDate, LocalDate endDate) {
        this.start = startDate;
        this.end = endDate;

    }
}
