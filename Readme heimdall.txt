Here’s a plain text version of a README file for Heimdall, formatted for a .txt file. This format provides the same information as the previous Markdown example but in a simple text layout.

Heimdall
========

Heimdall is a tool for flashing firmware onto Samsung devices. It is a cross-platform alternative to Samsung's Odin tool, providing a way to interact with Samsung devices in Download Mode.

Table of Contents
-----------------
1. Features
2. Requirements
3. Installation
   - Linux
   - Windows
   - macOS
4. Usage
   - Flashing Firmware
   - Command-Line Options
5. Troubleshooting
6. License
7. Contributing

Features
--------
- Flash firmware files to Samsung devices.
- Support for various file formats, including .tar, .tar.md5, and .img.
- Works on Linux, Windows, and macOS.
- Open-source and actively maintained.

Requirements
------------
- A Samsung device in Download Mode.
- USB Debugging enabled (for certain operations).
- Proper drivers installed (especially on Windows).

Installation
------------
Linux:
1. Install the required dependencies:
   sudo apt-get install build-essential cmake git libusb-1.0-0-dev

2. Clone the Heimdall repository:
   git clone https://github.com/Benjamin-Dobell/Heimdall.git
   cd Heimdall

3. Build Heimdall:
   mkdir build
   cd build
   cmake ..
   make
   sudo make install

Windows:
1. Download the latest release from the Heimdall Releases page:
   https://github.com/Benjamin-Dobell/Heimdall/releases

2. Extract the contents of the ZIP file.

3. Install the necessary USB drivers (Samsung USB Driver).

4. Open a Command Prompt and navigate to the extracted folder to run Heimdall commands.

macOS:
1. Install Homebrew if you haven't already:
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

2. Install Heimdall:
   brew install heimdall

Usage
-----
Flashing Firmware:
1. Put your Samsung device into Download Mode:
   - Power off the device.
   - Press and hold Volume Down + Home + Power until a warning screen appears.
   - Press Volume Up to enter Download Mode.

2. Use Heimdall to flash the firmware:
   heimdall flash --RECOVERY recovery.img

   Replace recovery.img with the appropriate firmware file name.

Command-Line Options:
- flash: Used to flash firmware files.
- --RECOVERY: Specify the recovery image to flash.
- --BOOT: Specify the boot image to flash.
- --SYSTEM: Specify the system image to flash.
- --DATA: Specify the data partition image to flash.
- --cache: Specify the cache partition image to flash.
- --no-reboot: Prevents automatic reboot after flashing.

For a full list of options, run:
heimdall --help

Troubleshooting
---------------
- If Heimdall is not detecting your device, ensure you have the proper drivers installed and that the device is in Download Mode.
- For USB connection issues, try different USB ports or cables.
- If flashing fails, ensure that the firmware files are compatible with your device model.

License
-------
Heimdall is released under the GPL-3.0 License.

Contributing
------------
Contributions are welcome! Please fork the repository and submit a pull request. For more details, check the CONTRIBUTING.md file in the repository.

Instructions

You can copy and paste the text above into a text file and save it as README.txt.

Adjust any specific details according to your project's requirements or any updates in the Heimdall tool.


If you need more adjustments or specific content added to the README, let me know!

