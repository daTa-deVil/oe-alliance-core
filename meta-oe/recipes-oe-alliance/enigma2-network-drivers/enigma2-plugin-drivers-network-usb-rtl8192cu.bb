SUMMARY = "Single-Chip IEEE 802.11b/g/n 2T2R WLAN Controller with USB 2.0 Interface"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RRECOMMENDS_${PN} = " \
    ${@base_contains("MACHINE_FEATURES", "extrakernelwifi", "kernel-module-rtl8192cu", "rtl8192cu", d)} \
    firmware-rtl8192cu \
    "

PV = "1.0"
PR = "r3"

ALLOW_EMPTY_${PN} = "1"
