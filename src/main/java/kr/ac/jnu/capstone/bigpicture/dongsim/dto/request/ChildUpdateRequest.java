package kr.ac.jnu.capstone.bigpicture.dongsim.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Builder
public class ChildUpdateRequest {

    @Schema(description = "아이 이름", example = "소진")
    private final String childName;

    @Schema(description = "아이 생년월일", example = "2019-01-01")
    private final LocalDate childBirthDate;
}
