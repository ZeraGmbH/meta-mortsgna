require lxqt-tiny-image.bb

export IMAGE_BASENAME = "lxqt-full-image"

IMAGE_INSTALL += " \
    packagegroup-gui-full \
"

IMAGE_LINGUAS = "${IMAGE_LINGUAS_FULL}"
