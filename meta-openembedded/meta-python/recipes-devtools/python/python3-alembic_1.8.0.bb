DESCRIPTION = "A database migration tool for SQLAlchemy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f5a8522010db1a393833988dbe2c7f0b"

inherit pypi setuptools3

SRC_URI[sha256sum] = "a2d4d90da70b30e70352cd9455e35873a255a31402a438fe24815758d7a0e5e1"

PYPI_PACKAGE = "alembic"

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-dateutil \
    ${PYTHON_PN}-editor \
    ${PYTHON_PN}-mako \
    ${PYTHON_PN}-sqlalchemy \
    ${PYTHON_PN}-misc \
"

BBCLASSEXTEND = "native nativesdk"
