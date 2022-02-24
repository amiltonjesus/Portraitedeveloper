from PyQt5.QtWidgets import *
from PyQt5 import QtCore, QtGui
from PyQt5.QtGui import *
from PyQt5.QtCore import *
import sys


class Window(QMainWindow):

    def __init__(self):
        super().__init__()
        self.setWindowTitle("Amilton Calendario ")
        self.setGeometry(12, 120, 430, 270)
        self.UiComponents()
        self.show()

    def UiComponents(self):
        calender = QCalendarWidget(self)
        calender.setGeometry(10, 10, 400, 250)
        calender.setAccessibleName("Geek Calendar")
        calender.activateWindow()


App = QApplication(sys.argv)
window = Window()
sys.exit(App.exec())