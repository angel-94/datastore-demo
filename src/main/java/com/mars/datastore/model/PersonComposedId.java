package com.mars.datastore.model;

import lombok.*;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

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
@Entity(name = "PersonComposedId")
public class PersonComposedId {

	@Id
	private PersonCompId id;
	private String name;
	private String desc;

}
