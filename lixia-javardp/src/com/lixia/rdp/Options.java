/* Options.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision: 1.1.1.1 $
 * Author: $Author: suvarov $
 * Date: $Date: 2007/03/08 00:26:14 $
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: Global static storage of user-definable options
 */
package com.lixia.rdp;

import java.awt.image.DirectColorModel;

public class Options {
    
    public static final int DIRECT_BITMAP_DECOMPRESSION = 0;
    public static final int BUFFEREDIMAGE_BITMAP_DECOMPRESSION = 1;
    public static final int INTEGER_BITMAP_DECOMPRESSION = 2;
    
    public static int bitmap_decompression_store = INTEGER_BITMAP_DECOMPRESSION;
    
    
	public static boolean low_latency = true; // disables bandwidth saving tcp packets
	public static int keylayout = 0x809; // UK by default
	public static String username = "root"; // -u username
	public static String domain = ""; // -d domain
	public static String password = ""; // -p password
	public static String hostname = ""; // -n hostname
	public static String command = "";  // -s command
	public static String directory = ""; // -d directory
	public static String windowTitle = "Elusiva Everywhere"; // -T windowTitle
	public static int width = 800; // -g widthxheight
	public static int height = 600; // -g widthxheight
	public static int port = 3389; // -t port
	public static boolean fullscreen = false;
	public static boolean built_in_licence = false;
    
	//setting
	public static boolean  autologin = false;
	public static boolean  bulk_compression = false;
	public static boolean  console_audio = false;
	
	public static boolean load_licence = false;
	public static boolean save_licence = false;

    public static String licence_path = "./";
    
    public static boolean debug_keyboard = false;
	public static boolean debug_hexdump = false;
    
	public static boolean enable_menu = false;
	//public static boolean paste_hack = true;
	public static boolean no_loginProgress = false;
	
	public static boolean seamless_active = false;
	public static boolean http_mode = false;
	public static String http_server = "192.168.0.115:8080/WSService/RDPSocket";
	
	public static int screenInsets_title = 14;
	
	public static boolean altkey_quiet = false;
	public static boolean caps_sends_up_and_down = true;
	public static boolean remap_hash = true;
	public static boolean useLockingKeyState = true;
	
	public static boolean use_rdp5 = true;
	public static int server_bpp = 24;							// Bits per pixel
	public static int Bpp = (server_bpp + 7) / 8;				// Bytes per pixel
	
	public static int bpp_mask =  0xFFFFFF >> 8 * (3 - Bpp);	// Correction value to ensure only the relevant
			                                                    // number of bytes are used for a pixel
    
    public static int imgCount = 0;
    
    
    public static DirectColorModel colour_model = new DirectColorModel(24,0xFF0000,0x00FF00,0x0000FF);
    
    /**
     * Set a new value for the server's bits per pixel
     * @param server_bpp New bpp value
     */
	public static void set_bpp(int server_bpp){
		Options.server_bpp = server_bpp;
		Options.Bpp = (server_bpp + 7) / 8;
//		if(server_bpp == 8) bpp_mask = 0xFF;
//        else bpp_mask = 0xFFFFFF;
		bpp_mask =  0xFFFFFF >> 8 * (3 - Bpp);
        colour_model = new DirectColorModel(24,0xFF0000,0x00FF00,0x0000FF);
	}
	
	
	public static int server_rdp_version;
	
	public static int win_button_size = 0;	/* If zero, disable single app mode */
	public static boolean bitmap_compression = true;
    public static boolean persistent_bitmap_caching = false;
    public static boolean bitmap_caching = true;
    public static boolean precache_bitmaps = true;
    public static boolean polygon_ellipse_orders = false;
	public static boolean sendmotion = true;
	public static boolean orders = true;
	public static boolean encryption = true;
	public static boolean packet_encryption = true;
	public static boolean desktop_save = true;
	public static boolean grab_keyboard = true;
	public static boolean hide_decorations = false;
	public static boolean console_session = false;
	public static boolean owncolmap;
	
	public static boolean use_ssl = false;
	public static boolean map_clipboard = true;
    public static int rdp5_performanceflags =   RdpJPanel.RDP5_NO_CURSOR_SHADOW | RdpJPanel.RDP5_NO_CURSORSETTINGS |
    											RdpJPanel.RDP5_NO_FULLWINDOWDRAG | RdpJPanel.RDP5_NO_MENUANIMATIONS |
    											RdpJPanel.RDP5_NO_THEMING | RdpJPanel.RDP5_NO_WALLPAPER;
    public static boolean save_graphics = false;
	
    public static boolean keys_register=true;
    public static boolean is_debug = false;
}
