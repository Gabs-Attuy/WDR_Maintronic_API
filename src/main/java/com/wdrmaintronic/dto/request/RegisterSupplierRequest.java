package com.wdrmaintronic.dto.request;

import lombok.*;
import org.hibernate.validator.constraints.br.CNPJ;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RegisterSupplierRequest {

    @NonNull
    private String companyName;

    @NonNull
    @CNPJ
    private String cnpj;

}
