SUMMARY = "Hello World application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/johannesneitzel/hello-world.git;branch=master;protocol=ssh"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake