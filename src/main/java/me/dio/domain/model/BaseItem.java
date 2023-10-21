package me.dio.domain.model;

import jakarta.persistence.*;

//classe que vai servir como abstração para as classes News e Feature, usando o principio DRY(don't repeat yourself)
@MappedSuperclass
public abstract class BaseItem {
	private Long id;
	private String icon;
	private String description;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
