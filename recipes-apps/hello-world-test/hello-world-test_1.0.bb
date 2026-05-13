SUMMARY = "Unit tests for hello-world add()"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "googletest"

SRC_URI = "git://git@github.com/johannesneitzel/hello-world.git;branch=master;protocol=ssh \
           file://test-add.cpp"



SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_compile() {
    ${CXX} ${CXXFLAGS} ${LDFLAGS} ${WORKDIR}/test-add.cpp -lgtest -lpthread -o hello-world-test
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-world-test ${D}${bindir}/hello-world-test
}

RDEPENDS:${PN} = "googletest"
