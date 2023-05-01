package kodlama.io.ecommerce.business.dto.pesponses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerResponse {
    private int id;
    private LocalDateTime dateRegistered;
}
