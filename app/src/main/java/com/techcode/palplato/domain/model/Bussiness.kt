package com.techcode.palplato.domain.model

import com.google.firebase.firestore.PropertyName

data class Business(
	val businessId: String = "",
	val ownerId: String = "",
	val name: String = "",
	val direction: String = "",
	val phone: String = "",
	val description: String = "",
	val state: Boolean = true,
	val products: List<String> = emptyList(),
	val date: Long = System.currentTimeMillis(),
	val logoUrl: String? = null,
	val categories: List<Category> = emptyList(),
	@get:PropertyName("isOpen")
	val isOpen : Boolean = false, // 👈 NUEVO
	val schedule: List<BusinessSchedule> = emptyList() // 👈 NUEVO
)

data class Category(
	val name: String = "",
	val products: List<String> = emptyList()
)

data class BusinessSchedule(
	val day: String = "",             // Ej: "Lunes"
	val openTime: String? = null,     // Ej: "09:00"
	val closeTime: String? = null,    // Ej: "18:00"
	@get:PropertyName("isOpen")
	val isOpen: Boolean = false       // true si el negocio abre este día
)

