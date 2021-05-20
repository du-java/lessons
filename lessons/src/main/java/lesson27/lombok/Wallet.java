package lesson27.lombok;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
public class Wallet {
    int amount;
}
