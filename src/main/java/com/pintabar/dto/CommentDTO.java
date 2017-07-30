package com.pintabar.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by lucasgodoy on 26/06/17.
 */
@Getter
@Setter
@Builder
public class CommentDTO implements Serializable {
	private String businessUuid;
	private String userUuid;
	private String comment;
}
