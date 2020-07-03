package io.netty.example;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Nostalie.zhang
 * @date: 2020/7/2
 * Time: 4:43 下午
 */
public class ByteBufferSelf {

    public static void main(String[] args) {
        UnpooledByteBufAllocator allocator = new UnpooledByteBufAllocator(true);
        ByteBuf byteBuf = allocator.directBuffer(8, 8);
        byteBuf.writeInt(1);
        byteBuf.writeInt(2);
        System.out.println(byteBuf.readInt());
        System.out.println(byteBuf.readInt());

        PooledByteBufAllocator pooledAllocator = new PooledByteBufAllocator(true);
        ByteBuf pooledByteBuf = pooledAllocator.directBuffer(8, 8);
        pooledByteBuf.writeInt(1);
        pooledByteBuf.writeInt(2);
        System.out.println(pooledByteBuf.readInt());
        System.out.println(pooledByteBuf.readInt());
    }
}
