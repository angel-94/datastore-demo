package com.mars.datastore.model;

import lombok.*;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

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
@Entity(name = "PersonSimpleId")
public class PersonSimpleId {

	@Id
	private String id;
	private String name;
	private String desc;

}
