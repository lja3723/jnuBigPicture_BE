package kr.ac.jnu.capstone.bigpicture.dongsim._common.api.body;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public abstract class ResponseBodyBase { }
