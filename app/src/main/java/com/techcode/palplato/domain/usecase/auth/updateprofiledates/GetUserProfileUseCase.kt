package com.techcode.palplato.domain.usecase.auth.updateprofiledates

import com.techcode.palplato.domain.model.UserProfileUpdate
import com.techcode.palplato.domain.repository.UserRepository
import javax.inject.Inject

class GetUserProfileUseCase @Inject constructor(
	private val userRepository: UserRepository
) {
	suspend operator fun invoke(userId: String): Result<UserProfileUpdate> {
		return userRepository.getUserProfile(userId)
	}
}