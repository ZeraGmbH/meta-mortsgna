require recipes-image/console/console-net-image.bb
require recipes-image/include/x11-base.inc

export IMAGE_BASENAME = "xfce4-base-image"

XFCE_DM ?= "lxdm"

IMAGE_INSTALL += " \
    ${X11_BASE_INSTALL} \
    ${XFCE_DM} \
    \
    packagegroup-xfce-base \
    packagegroup-image-base \
    \
    network-manager-applet \
    xfce4-default-config \
    xfce4-whiskermenu-plugin \
"

# reenable graphical target
IMAGE_FEATURES += "x11-base"
