# KeepPotion

```text
依頼者: あか-AK 様
使用言語: Kotlin
形態: Bukkit (Paper) 1.20.4
```

## 仕様
プレイヤーが死亡したとき、通常ポーションエフェクトが消えるが、そのデータを保持する。
死亡し、リスポーンするタイミングでプレイヤーが持っているエフェクトをEachしますが、その時 ```1tick``` 遅らせています。
これはマインクラフトの仕様上Tickを遅らせることでエフェクトが付与できるのでこうしました。```1tickの遅延``` ですが、支障はでません。

## License

---

**MIT License.**

You may fork and use my project without notification, provided you adhere to the following conditions.

- Add a link to [this repository](https://github.com/hideko-dev/UnderBlocks)

> Check out [LICENSE](./LICENSE) for more detail.