DESCRIPTION = "Simple Fibonacci application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI += "git://github.com/BPMD/fibo.git \
	   file://Diff.patch \
"

SRCREV ="bd0bc483c0555cfd3a87fd947ee00feb77fdc3e7"
S = "${WORKDIR}/git"


inherit autotools
PARALLEL_MAKE = ""

# do_compile() {
#	${CC} -c -o src/App_Main.o src/App_Main.c -I ./include
#	${CC} -c -o src/Fibonacci.o src/Fibonacci.c -I ./include
#	${CC} -c -o src/Prime.o src/Prime.c -I ./include  
#	${CC} src/App_Main.o src/Fibonacci.o src/Prime.o -o Fibonacci-FizzBuzz
# }

# do_install() {
#	install -d ${D}${bindir}
#	install -m 0755 fibo ${D}${bindir}
#}
