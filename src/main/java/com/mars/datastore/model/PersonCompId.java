package com.mars.datastore.model;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author Angel Ruiz
 * @version 1.0.0
 * date 14/06/23
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonCompId {

	private String id;
	private LocalDateTime timestamp;

}
