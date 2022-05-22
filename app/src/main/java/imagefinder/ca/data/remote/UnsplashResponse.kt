package imagefinder.ca.data.remote

import imagefinder.ca.data.local.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
