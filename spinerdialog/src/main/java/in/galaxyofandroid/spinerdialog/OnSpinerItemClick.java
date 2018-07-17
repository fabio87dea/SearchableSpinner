package in.galaxyofandroid.spinerdialog;

import org.json.JSONObject;

/**
 * Created by Md Farhan Raja on 2/23/2017.
 */

public interface OnSpinerItemClick
{
    public void onClick(String item,int position);
    public void onClick(String item, int position, JSONObject jo);
}
