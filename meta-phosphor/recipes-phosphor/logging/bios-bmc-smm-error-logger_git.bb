SUMMARY = "BIOS BMC SMM Error Logger"
DESCRIPTION = "Allows BIOS in SMM to log errors to the BMC"
PR = "r1"
PV = "0.1+git${SRCPV}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
inherit meson pkgconfig systemd

DEPENDS += " \
  boost \
  fmt \
  stdplus \
  systemd \
  nlohmann-json \
  libbej \
  sdbusplus \
  phosphor-dbus-interfaces \
"

EXTRA_OEMESON = " \
  -Dtests=disabled \
"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/openbmc/bios-bmc-smm-error-logger;branch=main;protocol=https"
SRCREV = "a3b64fb63eb86e554657168133804db5db271f5e"

SYSTEMD_SERVICE:${PN} += "xyz.openbmc_project.bios_bmc_smm_error_logger.service"
