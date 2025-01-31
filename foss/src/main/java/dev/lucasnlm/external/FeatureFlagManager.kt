package dev.lucasnlm.external

class FeatureFlagManager : IFeatureFlagManager() {
    override val isGameHistoryEnabled: Boolean = true
    override val isRateUsEnabled: Boolean = false
    override val isInAppAdsEnabled: Boolean = false
    override val isGameplayAnalyticsEnabled: Boolean = false

    override suspend fun refresh() {
        // No Feature Flags on FOSS
    }
}
