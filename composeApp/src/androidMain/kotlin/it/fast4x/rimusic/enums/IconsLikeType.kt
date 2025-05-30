package it.fast4x.rimusic.enums

import androidx.annotation.StringRes
import app.kreate.android.R
import me.knighthat.enums.TextView

enum class IconLikeType(
    @field:StringRes override val textId: Int
): TextView {

    Apple( R.string.icon_like_apple ),

    Breaked( R.string.icon_like_breaked ),

    Brilliant( R.string.icon_like_brilliant ),

    Essential( R.string.pcontrols_essential ),

    Gift( R.string.icon_like_gift ),

    Shape( R.string.icon_like_shape ),

    Striped( R.string.icon_like_striped );
}