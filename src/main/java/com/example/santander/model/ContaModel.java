package com.example.santander.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaModel {
    private String accountNumber;
    private String agencyNumber;
    private String clientId;
    private String bankName;

}
