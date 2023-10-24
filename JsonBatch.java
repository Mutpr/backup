package xedrm.mybatis.custom;

import java.net.URL;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
public class JsonBatch extends Task {

	public JsonBatch() {
		super(NAME);

	}

	@Override
	public boolean isConcurrent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIndeterminate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean runTask() throws Exception {
		final String HOST_URL = "";
		JSONObject jsonObject = JSONObjectReturn(HOST_URL);
		JSONArray json = jsonObject.getJSONArray("usersInfoList");
		for(int i = 0; i<json.length(); i++) {
			System.out.println(json.getJSONObject(i));
			userInfoInsert(json.getJSONObject(i));
			groupInfoInsert(json.getJSONObject(i));
		}
		
		return interruptRequested;
	}
	
	public static JSONObject JSONObjectReturn(String HostURL) {
		HttpURLConnection conn = null;
		JSONObject responseJson = null;
		try {
			URL url = new URL(HostURL);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setRequestMethod("GET");

			int responseCode = conn.getResponseCode();
			if (responseCode == 400 || responseCode == 401 || responseCode == 500) {
				System.out.println(responseCode + " error");
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
				StringBuilder sb = new StringBuilder();
				String line = "";
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}

				responseJson = new JSONObject(sb.toString());
				System.out.println(responseJson);
				
				return responseJson;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseJson;
	}
	
	public void userInfoInsert(JSONObject jsonObject) throws Exception {
		Connection conn = null;
		String url = "";
		String id = "";
		String pws = "";
		PreparedStatement pstmt;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, id, pws);
			System.out.println(conn);
			pstmt = conn.prepareStatement("INSERT INTO public.USER_TEMP (USERID, USERNAME, ENABLE, MANAGER_YN, groupid) VALUES(?,?,?,?,?)");
			String user_id = (String)jsonObject.get("user_id");
			System.out.println(user_id);
			String user_name = (String)jsonObject.get("user_name");
			System.out.println(user_name);
			String group_id =(String)jsonObject.get("group_id");
			System.out.println(group_id);
				pstmt.setString(1, user_id);
				pstmt.setString(2, user_name);
				pstmt.setString(3, "true");
				pstmt.setString(4, "n");
				pstmt.setString(5, group_id);
				pstmt.execute();
				System.out.println("--성공--");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void groupInfoInsert(JSONObject jsonObject) {
		Connection conn = null;
		String url = "";
		String id = "";
		String pws = "";
		PreparedStatement pstmt;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, id, pws);
			System.out.println(conn);
			pstmt = conn.prepareStatement("INSERT INTO public.GROUP_TEMP (GROUPID, GROUPNAME, PARENTID) VALUES(?,?,?)");
			String group_id = (String)jsonObject.get("group_id");
			System.out.println(group_id);
			String group_name = (String)jsonObject.get("group_name");
			System.out.println(group_name);
			if(group_id.equals("C0000")) {
				pstmt.setString(1,group_id);
				pstmt.setString(2, group_name);
				pstmt.setString(3, null);
				pstmt.execute();
			}else if(group_id.equals("C0001")){
				pstmt.setString(1, group_id);
				pstmt.setString(2, group_name);
				pstmt.setString(3, "C0000");
				pstmt.execute();
			}else {
				pstmt.setString(1, group_id);
				pstmt.setString(2, group_name);
				pstmt.setString(3, "C0001");
				pstmt.execute();
			}
			
				System.out.println("--성공--");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
