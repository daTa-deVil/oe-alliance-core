require stm-directfb.inc

PROVIDES = "directfb"
RPROVIDES_${PN} = "directfb"
RREPLACES_${PN} = "directfb"
RCONFLICTS_${PN} = "directfb"

RV = "1.4-5"
PR = "r4"

DEPENDS += "sysfsutils"

EXTRA_OECONF = "\
	--enable-static \
	--disable-devmem \
	--disable-sdl \
	--with-gfxdrivers=stgfx \
	--enable-mme=yes \
	--disable-multi \  
	--disable-x11 \
        --without-software \
        --enable-stmfbdev \
        --disable-fbdev \
"

LEAD_SONAME = "libdirectfb-1.4.so.5"

SRC_URI[md5sum] = "55bbcedee602406b85f68b75be691302"
SRC_URI[sha256sum] = "3d5dc03c1884d65a5cad7da6e8cbe456a0ee288b8422e586ce28d256d01eb33d"

COMPATIBLE_MACHINE = "^(spark|spark7162)$"
