package kz.alimgaziyev.bankappspringbooth2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WithdrawDepositDto {
    Double amount;
    Long clientId = 0l;
}
