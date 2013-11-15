DESCRIPTION = "Music Player Daemon library"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
HOMEPAGE ="http://sourceforge.net/projects/musicpd"
DEPENDS = "glib-2.0"

SRC_URI = "git://repo.or.cz/libmpd.git;tag=release-${PV};protocol=git"

S = "${WORKDIR}/git"

inherit autotools
