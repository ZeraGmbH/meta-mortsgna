require recipes-image/console/console-net-image.bb
require recipes-image/include/x11-base.inc

export IMAGE_BASENAME = "allgui-base-image"

# currently: plasma / xfce / lxqt / weston
IMAGE_INSTALL += " \
    ${X11_BASE_INSTALL} \
    packagegroup-gui-base \
    \
    sddm \
    \
    kf5-world \
    plasma-world \
    \
    packagegroup-xfce-base \
    \
    packagegroup-lxqt-base \
    lxqt-default-config \
    \
    lumina \
    \
    weston weston-xwayland \
    \
    mesa-demos \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
