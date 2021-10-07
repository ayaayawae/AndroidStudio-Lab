package id.ac.umn.uts_38083;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarSFXAdapter extends RecyclerView.Adapter<DaftarSFXAdapter.ItemSFXViewHolder> {
    private LinkedList<SumberSFX> mDaftarSFX;
    private LayoutInflater mInflater;
    private Context mContext;

    public DaftarSFXAdapter(Context mContext, LinkedList<SumberSFX> mDaftarSFX) {
        this.mDaftarSFX = mDaftarSFX;
        this.mInflater = LayoutInflater.from(mContext);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ItemSFXViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.sfx_item_layout, parent, false);
        return new ItemSFXViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemSFXViewHolder holder, int position) {
        SumberSFX mSumberSFX = mDaftarSFX.get(position);
        holder.tvJudul.setText(mSumberSFX.getJudul());
        holder.tvKeterangan.setText(mSumberSFX.getKeterangan());
//        holder.tvUri.setText(mSumberSFX.getSoundURI());
    }

    @Override
    public int getItemCount() {
        return mDaftarSFX.size();
    }

    public class ItemSFXViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvJudul, tvKeterangan, tvUri;
        private ImageButton btnDelete;
        private DaftarSFXAdapter mAdapter;
        private int mPosisi;
        private SumberSFX mSumberSFX;

        public ItemSFXViewHolder(@NonNull View itemView, DaftarSFXAdapter adapter) {
            super(itemView);
            mAdapter = adapter;
            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvKeterangan = itemView.findViewById(R.id.tvKeterangan);
            btnDelete = itemView.findViewById(R.id.deleteBtn);

//            tvUri = itemView.findViewById(R.id.tvUri)

            btnDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    removeAt(getLayoutPosition());
                }
            });

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mPosisi = getLayoutPosition();
            mSumberSFX = mDaftarSFX.get(mPosisi);
            Intent detilInten = new Intent(mContext, DetilSFXActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("DetilSFX", mSumberSFX);
            detilInten.putExtras(bundle);
            mContext.startActivity(detilInten);
        }
    }

    public void removeAt(int position) {
        mDaftarSFX.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mDaftarSFX.size());
    }
}
